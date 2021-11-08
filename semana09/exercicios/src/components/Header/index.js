import React from "react";
import { Link } from "react-router-dom";
import logo from "./logo.png";

class Header extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <header className="App-header">
        <section>
          <img src={logo} className="App-logo" alt="logo" />
          <h1>Palatare</h1>
        </section>
        <section>
          <nav>
            {window.location.pathname !== "/" && <Link to={"/"}>Home</Link>}
          </nav>
        </section>
      </header>
    );
  }
}

export default Header;
