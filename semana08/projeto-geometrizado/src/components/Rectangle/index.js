import React from 'react';

class Rectangle extends React.Component {

    render() {
        return (
            <div
                style={{background: this.props.color}}
                className='rectangle'>
            </div>
        )
    }
}

export default Rectangle;