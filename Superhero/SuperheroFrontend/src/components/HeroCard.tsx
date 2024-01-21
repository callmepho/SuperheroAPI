import React from "react";
import { NavLink } from "react-router-dom";

const HeroCard = ({ hero }: any) => {
  return (
    <div>
      <NavLink to={`${hero.id}`}>
        <img src={hero.images.sm} />
      </NavLink>
      <h4>{hero.name}</h4>
    </div>
  );
};

export default HeroCard;
