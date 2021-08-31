alert('Não esqueça de assistir ao vídeo');

//7 Faça com que o usuário confirme antes de seguir
document.getElementById('segundo').onclick = function() {confirm('Deseja prosseguir?') ? window.location='segundo.html' : windows.location='#'};