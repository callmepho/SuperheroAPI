import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import { QueryClient, QueryClientProvider } from "react-query";
import HeroDBPage from "./pages/HeroDBPage/HeroDBPage";
import HerosContextProvider from "./context/HerosContextProvider";
import NavBar from "./components/NavBar";
import MyHerosPage from "./pages/MyHerosPage/MyHerosPage";
import MyHerosContextProvider from "./context/MyHerosContextProvider";
import HeroDetailPage from "./pages/HeroDetailPage/HeroDetailPage";

const queryClient = new QueryClient();

function App() {
  return (
    <>
      <QueryClientProvider client={queryClient}>
        <HerosContextProvider>
          <MyHerosContextProvider>
            <BrowserRouter>
              <NavBar />
              <Routes>
                <Route path="/" element={<HeroDBPage />} />
                {/* <Route path='/db' element={<HeroDBPage />}/> */}
                <Route path="/:id" element={<HeroDetailPage />} />
                <Route path="/myheros" element={<MyHerosPage />} />
                {/* <Route path='/myheros/:id' element={<HeroPageLoader />}/> */}
              </Routes>
            </BrowserRouter>
          </MyHerosContextProvider>
        </HerosContextProvider>
      </QueryClientProvider>
    </>
  );
}

export default App;
