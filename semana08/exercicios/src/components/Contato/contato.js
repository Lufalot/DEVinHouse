import React from "react";

class Contato extends React.Component {
  render() {
    return (
      <section class="contato">
        <img src={this.props.img} width="50px" alt="avatar" />
        <ul>
          <h6>{this.props.name}</h6>
          <span>{this.props.about}</span>
        </ul>
      </section>
    );
  }
}

export default Contato;
