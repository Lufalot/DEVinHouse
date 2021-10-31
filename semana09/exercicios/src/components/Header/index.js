import React from "react";
import logo from "./logo.png";

class Header extends React.Component {
  render() {
    return (
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1>Palatare</h1>
        <h6>{this.props.page}</h6>
      </header>
    );
  }
}

export default Header;
