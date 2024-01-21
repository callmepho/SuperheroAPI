import React, { useContext } from "react";
import { useQuery } from "react-query";
import { useParams } from "react-router-dom";
import { MyHeros } from "../../services/myHeros";
import { MyHerosContext } from "../../context/MyHerosContextProvider";

const HeroDetailPage = () => {
  let { id } = useParams();
  const { refetch } = useContext(MyHerosContext);
  const { isLoading, isError, data, error } = useQuery<any, Error>("hero", () =>
    fetch(`https://akabab.github.io/superhero-api/api//id/${id}.json`).then(
      (res) => res.json()
    )
  );

  if (isLoading) {
    return <span>Loading...</span>;
  }

  if (isError) {
    return <span>Error: {error.message}</span>;
  }

  const saveHero = async () => {
    const { id, ...hero } = data;
    await MyHeros.create(hero)
      .then((response) => console.log(response))
      .catch((error) => console.log(error));
    refetch();
  };

  return (
    <div>
      {data.name}
      <button onClick={saveHero}>Save</button>
    </div>
  );
};

export default HeroDetailPage;
