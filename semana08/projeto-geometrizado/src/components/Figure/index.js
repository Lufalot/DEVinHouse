import React from 'react';
import Square from '../Square/index';
import Circle from '../Circle/index';
import Triangle from '../Triangle/index';
import Rectangle from '../Rectangle/index';

import PropTypes from 'prop-types';

class Figure extends React.Component {

    render() {
        switch(this.props.type) {
            case 'square':
                return(<Square color={this.props.color} />);
            case 'circle':
                return(<Circle color={this.props.color} />);
            case 'triangle':
                return(<Triangle color={this.props.color} />);
            case 'rectangle':
                return(<Rectangle color={this.props.color} />);
            default:
                return('');
        }
    }
}

Figure.propTypes = {
    type: PropTypes.oneOf(['square','circle','triangle','rectangle']),
    color: PropTypes.string
    
}

export default Figure;