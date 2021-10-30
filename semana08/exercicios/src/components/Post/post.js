import { Component } from "react";

class Post extends Component {
  render() {
    return (
      <div>
        <header>
          <img src={this.props.avatar} alt={this.props.name} width={"50px"} />
          <h1>{this.props.name}</h1>
          <span>{this.props.time}</span>
          <menu>{this.props.menu}</menu>
        </header>
        <div className="content">
          <p>{this.props.text}</p>
          <img src={this.props.image} width={"300px"} />
        </div>
        <footer className="reactions">
          <section>
            <p>{this.props.comments}</p>
            <p>{this.props.share}</p>
          </section>
          <section>{this.props.information}</section>
        </footer>
      </div>
    );
  }
}

export default Post;
