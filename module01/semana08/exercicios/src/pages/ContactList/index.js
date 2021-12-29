import React, { Component } from "react";
import LoginButton from "../../components/Button/loginButton";
import Contato from "../../components/Contato/contato";
import img from "../../images/snakes_escher.jpg";
import avatar from "../../images/Matsya-Avatar.png";

class ContactList extends Component {
  render() {
    return (
      <div className="contactList">
        <LoginButton bgcolor={"blue"}></LoginButton>
        <ul className="listaContato">
          <Contato
            img={img}
            name={"Lucas F. Lotaif"}
            about={"Almost a full stack developer"}
          />
          <Contato
            img={avatar}
            name={"Another Contact"}
            about={"about this contact"}
          />
          <Contato
            img={avatar}
            name={"Another Contact"}
            about={"about this contact"}
          />
          <Contato
            img={avatar}
            name={"Another Contact"}
            about={"about this contact"}
          />
        </ul>
      </div>
    );
  }
}

export default ContactList;
