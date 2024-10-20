// scripts.js
function showLoginForm() {
    document.getElementById('login-form').style.display = 'block';
    document.getElementById('register-form').style.display = 'none';
    document.getElementById('reset-form').style.display = 'none';
}

function showRegisterForm() {
    document.getElementById('login-form').style.display = 'none';
    document.getElementById('register-form').style.display = 'block';
    document.getElementById('reset-form').style.display = 'none';
}

function showResetForm() {
    document.getElementById('login-form').style.display = 'none';
    document.getElementById('register-form').style.display = 'none';
    document.getElementById('reset-form').style.display = 'block';
}

document.getElementById('login').addEventListener('submit', function(e) {
    e.preventDefault();
    // 登录逻辑
    const username = document.getElementById('login-username').value;
    const password = document.getElementById('login-password').value;
    // 发送登录请求
    fetch('/user/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username, password })
    }).then(response => {
        if (response.ok) {
            alert('登录成功');
            window.location.href = '../html/questions.html';
        } else {
            alert('登录失败');
        }
    });
});

document.getElementById('register').addEventListener('submit', function(e) {
    e.preventDefault();
    // 注册逻辑
    const username = document.getElementById('register-username').value;
    const email = document.getElementById('register-email').value;
    const password = document.getElementById('register-password').value;
    // 发送注册请求
    fetch('/user/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username, email, password })
    })
        .then(response => response.json())
                .then(data => {
                    handleResponse(data);
                })
                .catch(error => {
                    console.error('Error:', error);
                });
});

document.getElementById('reset').addEventListener('submit', function(e) {
    e.preventDefault();
    // 密码重置逻辑
    const email = document.getElementById('reset-email').value;
    // 发送重置请求
    fetch('/api/reset', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ email })
    }).then(response => {
        if (response.ok) {
            alert('重置邮件已发送');
        } else {
            alert('重置失败');
        }
    });
});


function handleResponse(data) {
    const statusCode = data.statusCode;
    const message = data.message;
    const obj = data.obj;

    // Display the message to the user
    alert(message);
    // document.getElementById('message').innerText = message;

    // Handle different status codes
    if (statusCode === 1) {
        // Registration successful
        console.log('Registration successful:', obj);
        // You can redirect the user or update the UI accordingly
    } else {
        // Registration failed
        console.log('Registration failed:', message);
        // Handle the failure case
    }
}