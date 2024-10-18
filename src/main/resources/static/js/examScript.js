document.addEventListener('DOMContentLoaded', function() {
    const urlParams = new URLSearchParams(window.location.search);
    const year = urlParams.get('year');

    fetch(`/api/questions/${year}`)
        .then(response => response.json())
        .then(data => {
            const questionsDiv = document.getElementById('questions');
            const answerSheetDiv = document.getElementById('answer-sheet');
            questionsDiv.innerHTML = '';
            answerSheetDiv.innerHTML = '';

            data.forEach((question, index) => {
                const questionDiv = document.createElement('div');
                questionDiv.classList.add('question');
                questionDiv.innerHTML = `
                    <h2>题 ${index + 1}</h2>
                    <p>${question.subQuestion}</p>
                    <ul>
                        <li>A: ${question.optionA}</li>
                        <li>B: ${question.optionB}</li>
                        <li>C: ${question.optionC}</li>
                        <li>D: ${question.optionD}</li>
                        <li>E: ${question.optionE}</li>
                    </ul>
                `;
                questionsDiv.appendChild(questionDiv);

                const answerButton = document.createElement('button');
                answerButton.textContent = index + 1;
                answerButton.addEventListener('click', function() {
                    window.scrollTo(0, questionDiv.offsetTop);
                });
                answerSheetDiv.appendChild(answerButton);
            });
        });

    document.getElementById('show-answer-sheet').addEventListener('click', function() {
        const answerSheet = document.getElementById('answer-sheet');
        answerSheet.style.display = answerSheet.style.display === 'block' ? 'none' : 'block';
    });
});