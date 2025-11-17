import { useState, useEffect } from "react";

export default function Digital() {
  const [time, setTime] = useState(new Date());

  useEffect(() => {
    const t = setInterval(() => setTime(new Date()), 1000);
    return () => clearInterval(t);
  }, []);

  return (
    <div style={{ textAlign: "center" }}>
      <h2>Digital Watch</h2>
      <h1>{time.toLocaleTimeString()}</h1>
    </div>
  );
}
