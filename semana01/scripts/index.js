alert('Não esqueça de assistir ao vídeo');

document.getElementById('segundo').addEventListener('click', changePage);

function changePage () {
    confirm('Deseja prosseguir?') ? window.location='segundo.html' : windows.location='#';
}