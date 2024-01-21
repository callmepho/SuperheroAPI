import React, { useContext } from "react";
import { HerosContext } from "../../context/HerosContextProvider";
import HeroCard from "../../components/HeroCard";
import styles from "./HeroDBPage.module.scss";

const HeroDBPage = () => {
  const { data, isLoading, isError, error } = useContext(HerosContext);

  if (isLoading) {
    return <span>Loading...</span>;
  }

  if (isError) {
    return <span>Error: {error.message}</span>;
  }

  return (
    <div className={styles.cardlist}>
      {data.map((hero: any) => (
        <HeroCard hero={hero} />
      ))}
    </div>
  );
};

export default HeroDBPage;
