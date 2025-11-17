import { Link, Outlet, useNavigate } from "react-router-dom";

export default function Layout({ setIsLoggedIn }) {
  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem("isLoggedIn");
    setIsLoggedIn(false);
    navigate("/login"); // redirect immediately
  };

  return (
    <div>
      <nav style={styles.nav}>
        <Link style={styles.link} to="/dashboard/counter">Counter</Link>
        <Link style={styles.link} to="/dashboard/digital">Digital Watch</Link>

        <button style={styles.logout} onClick={handleLogout}>
          Logout
        </button>
      </nav>

      <div style={{ padding: "20px" }}>
        <Outlet />
      </div>
    </div>
  );
}

const styles = {
  nav: {
    display: "flex",
    gap: "20px",
    padding: "15px",
    background: "#222",
    color: "white",
    alignItems: "center",
  },
  link: {
    color: "white",
    textDecoration: "none",
    fontSize: "18px",
  },
  logout: {
    marginLeft: "auto",
    padding: "8px 14px",
    background: "crimson",
    color: "white",
    border: "none",
    borderRadius: "5px",
    cursor: "pointer",
  }
};
