import React from "react";
import { Link } from "react-router-dom";

class ReceitaItem extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      isLiked: false,
    };
  }

  handleLike = (e) => {
    this.setState((prevState) => ({
      isLiked: !prevState.isLiked,
    }));
  };

  render() {
    return (
      <section className="receitasItem">
        <img src={this.props.image} alt={this.props.name} height="200px" />
        <h4>{this.props.name}</h4>
        <span>{this.props.description}</span>
        <div className="footer-buttons">
          <Link
            to={{
              pathname: "/receita",
              state: { ...this.props },
            }}
          >
            <input type="button" value="Veja a Receita" />
          </Link>
          <span
            onClick={this.handleLike}
            style={{
              color: this.state.isLiked ? "red" : "black",
              cursor: "copy",
            }}
          >
            ❤
          </span>
        </div>
      </section>
    );
  }
}

export default ReceitaItem;
