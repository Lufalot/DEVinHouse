import React from 'react';

class Circle extends React.Component {

    render() {
        return(
            <div
                className="circle"
                style={{background: this.props.color}}>
            </div>
        )
    }
}

export default Circle;