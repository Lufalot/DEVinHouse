import React from "react";

class Button extends React.Component {
  render() {
    return (
      <input
        type="button"
        value={this.props.title}
        style={{ backgroundColor: this.props.bgcolor, color: "white" }}
      />
    );
  }
}

export default Button;
