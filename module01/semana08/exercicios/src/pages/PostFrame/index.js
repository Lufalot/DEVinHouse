import { Component } from "react";
import Post from "../../components/Post/post";
import avatar from "../../images/Matsya-Avatar.png";
import imagem from "../../images/snakes_escher.jpg";
import "./index.css";

class PostFrame extends Component {
  render() {
    return (
      <>
        <Post
          avatar={avatar}
          name={"Lucas F."}
          time={"5m"}
          menu={"⋮"}
          text={"Lorem Ipsum blah blah blah"}
          image={imagem}
          comments={"💬 comments"}
          share={"Share"}
          information={"❤ Liked by millions"}
        />
        <Post
          avatar={avatar}
          name={"Lucas F."}
          time={"5m"}
          menu={"⋮"}
          text={"Lorem Ipsum blah blah blah"}
          image={imagem}
          comments={"💬 comments"}
          share={"Share"}
          information={"❤ Liked by millions"}
        />
        <Post
          avatar={avatar}
          name={"Lucas F."}
          time={"5m"}
          menu={"⋮"}
          text={"Lorem Ipsum blah blah blah"}
          image={imagem}
          comments={"💬 comments"}
          share={"Share"}
          information={"❤ Liked by millions"}
        />
      </>
    );
  }
}

export default PostFrame;
