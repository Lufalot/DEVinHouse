import React from "react";
import logo from "./logo.png";

class Header extends React.Component {
  render() {
    return (
      <header className="App-header">
        <section>
          <img src={logo} className="App-logo" alt="logo" />
          <h1>Palatare</h1>
        </section>
        <section>
          <h6>{this.props.page}</h6>
          <nav>
            <a href="#">Receitas</a>
          </nav>
        </section>
      </header>
    );
  }
}

export default Header;
