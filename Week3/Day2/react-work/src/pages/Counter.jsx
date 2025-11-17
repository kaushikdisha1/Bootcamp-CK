import { useState } from "react";

export default function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div style={{ textAlign: "center" }}>
      <h2>Counter Page</h2>
      <h1>{count}</h1>

      <button onClick={() => setCount(count + 1)}>Increment</button>
      <button
        style={{ marginLeft: "10px" }}
        onClick={() => setCount(count - 1)}
      >
        Decrement
      </button>
    </div>
  );
}
