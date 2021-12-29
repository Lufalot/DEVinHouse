import React from 'react';

class Triangle extends React.Component {

    render() {
        return(
            <div
                className="triangle"
                style={{borderBottomColor: this.props.color}}>

            </div>
        )
    }
}

export default Triangle;