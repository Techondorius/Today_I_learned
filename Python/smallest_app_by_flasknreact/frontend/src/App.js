import axios from "axios";
import React from "react";

const baseURL = "http://127.0.0.1:5000/noot";

export default function App() {
  const [post, setPost] = React.useState(null);

  React.useEffect(() => {
    axios.get(baseURL).then((response) => {
      setPost(response.data);
    });
  }, []);
  
  if (!post) return null;

  return (
    <div>
      <h1>{post.message}</h1>
    </div>
  );
}