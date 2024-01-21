import React, { ReactNode, createContext } from "react";
import { useQuery } from "react-query";
import { MyHeros } from "../services/myHeros";

export const MyHerosContext = createContext<any>(null);

interface MyHerosContextProviderProps {
  children: ReactNode;
}

const MyHerosContextProvider: React.FC<MyHerosContextProviderProps> = ({
  children,
}) => {
  const { isLoading, isError, data, error, refetch } = useQuery<any[], Error>(
    "myheros",
    () => MyHeros.get().then((res) => res)
  );
  return (
    <MyHerosContext.Provider
      value={{ data, isLoading, isError, error, refetch }}>
      {children}
    </MyHerosContext.Provider>
  );
};

export default MyHerosContextProvider;
