import React, { useContext } from "react";
import { MyHerosContext } from "../../context/MyHerosContextProvider";
import HeroCard from "../../components/HeroCard";

const MyHerosPage = () => {
  const { data, isLoading, isError, error } = useContext(MyHerosContext);

  if (isLoading) {
    return <span>Loading...</span>;
  }

  if (isError) {
    return <span>Error: {error.message}</span>;
  }
  return (
    <div>
      {data.map((hero: any) => (
        <HeroCard hero={hero} />
      ))}
    </div>
  );
};

export default MyHerosPage;
