import { NavLink } from "react-router-dom";

const NavBar = () => {
  return (
    <nav>
      <NavLink to="/">Hero Database</NavLink>
      <NavLink to="/myheros">My Heros</NavLink>
    </nav>
  );
};

export default NavBar;
