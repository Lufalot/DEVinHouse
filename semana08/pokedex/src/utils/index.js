function handlerGenerateBg(type) {
    switch(type) {
        case 'Fire':
            return '#FF4000';
        case 'Grass':
            return '#80F780';
        case 'Water':
            return '#01BFFE';
        case 'Poison':
            return '#8259FB';
        case 'Bug':
            return '#F3F781';
        case 'Normal':
            return '#E7E7E6';
        case 'Electric':
            return '#2F64FF';
        default:
            return '#A9F4F3';
    }
};

function handlerStrength(attack) {
    if(attack >= 50) return 'Forte';
    return 'Fraco';
}

export {handlerGenerateBg, handlerStrength};
