const relogio = setInterval(function() {
    let hora = new Date().getHours();
    let minuto = new Date().getMinutes();
    minuto = (minuto<10?'0':'') + minuto;
    document.getElementById('hora').textContent = `Hora atual: ${hora}:${minuto}`;
    },
    1000
);