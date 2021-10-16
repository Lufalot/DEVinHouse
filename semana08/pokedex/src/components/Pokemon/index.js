import React from 'react';
import PropsTypes from 'prop-types';
import {handlerGenerateBg, handlerStrength} from '../../utils/index';


class Pokemon extends React.Component {
    render() {

        const typePokemon = this.props.types[0];
        const corBg = handlerGenerateBg(typePokemon);

        const strength = handlerStrength(this.props.attack);

        return(
            <div className="pokemon" style={{background: corBg}}>
                
                <img
                    className="pokemon-image"
                    src={this.props.photo || 'https://www.purarteadesivos.com.br/wp-content/uploads/2017/04/adesivo-personalizado-pokebola-pokemon-recorte-eletronico-geek-nerd-gamer-pura-arte-adesivos.png'}
                    alt={`pokemon ${this.props.name}`}
                />
                
                <h2>{this.props.name}</h2>
                
                <ul className="pokemon-info">
                    <li>HP: {this.props.hp}</li>
                    <li>Attack: {this.props.attack}</li>
                    <li>Defense: {this.props.defense}</li>
                </ul>

                <div>
                    {this.props.types.join(' / ')}
                </div>
                {strength}

            </div>
        );
    }
};

Pokemon.propsTypes = {
    name: PropsTypes.string.isRequired,
    photo: PropsTypes.string,
    hp: PropsTypes.number.isRequired,
    attack: PropsTypes.number.isRequired,
    defense: PropsTypes.number.isRequired,
    types: PropsTypes.arrayOf(PropsTypes.string)
};

export default Pokemon;