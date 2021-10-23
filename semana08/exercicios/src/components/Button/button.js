import React from "react";

class Button extends React.Component {
  constructor(props) {
    super(props);
    this.title = this.props.title;
    this.bgcolor = this.props.bgcolor;
  }

  render() {
    return (
      <input
        type="button"
        value={this.title}
        style={{ backgroundColor: this.bgcolor, color: "white" }}
      />
    );
  }
}

export default Button;
