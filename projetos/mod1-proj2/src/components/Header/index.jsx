import React from "react";
import { NavItem } from "react-bootstrap";
import { Link } from "react-router-dom";
import "./styles.css";

function Header(props) {
  return (
    <header>
      <h1>
        <Link to="/map">SGI</Link>
      </h1>
      <nav>
        <NavItem>
          <Link to="/map"> Home</Link>
        </NavItem>
        <NavItem>
          <Link to="/form/produto">Produto</Link>
        </NavItem>
        <NavItem>
          <Link to="/form/empresa">Empresa</Link>
        </NavItem>
      </nav>
    </header>
  );
}

export default Header;
