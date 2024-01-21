import React, { ReactNode, createContext } from "react";
import { useQuery } from "react-query";

export const HerosContext = createContext<any>(null);

interface HerosContextProviderProps {
  children: ReactNode;
}

const HerosContextProvider: React.FC<HerosContextProviderProps> = ({
  children,
}) => {
  const { isLoading, isError, data, error } = useQuery<any[], Error>(
    "heros",
    () =>
      fetch("https://akabab.github.io/superhero-api/api/all.json").then((res) =>
        res.json()
      )
  );
  return (
    <HerosContext.Provider value={{ data, isLoading, isError, error }}>
      {children}
    </HerosContext.Provider>
  );
};

export default HerosContextProvider;
