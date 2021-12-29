import React from "react";

class LoginButton extends React.Component {
  constructor(props) {
    super(props);
    this.state = { isLoggedin: false };
  }

  handleClick = () => {
    this.setState({ isLoggedin: !this.state.isLoggedin });
  };

  render() {
    return (
      <input
        type="button"
        value={!this.state.isLoggedin ? "Login" : "Logout"}
        style={{ backgroundColor: this.props.bgcolor, color: "white" }}
        onClick={this.handleClick}
      />
    );
  }
}

export default LoginButton;
