import React from "react";

class Produto extends React.Component {
  render() {
    return (
      <div>
        <img src={this.props.photo} alt={this.props.name} />
        <span id="name">{this.props.name}</span>
        <span id="price">{this.props.price}</span>
      </div>
    );
  }
}

export default Produto;
