document.getElementById('search-button').addEventListener('click', function() {
    const level = document.getElementById('level').value;
    fetch(`/api/questions/years?level=${level}`)
        .then(response => response.json())
        .then(data => {
            const resultsDiv = document.getElementById('results');
            resultsDiv.innerHTML = '';
            data.forEach(year => {
                const yearDiv = document.createElement('div');
                yearDiv.textContent = year;
                yearDiv.addEventListener('click', function() {
                    window.location.href = `examPage.html?year=${year}`;
                });
                resultsDiv.appendChild(yearDiv);
            });
        });
});