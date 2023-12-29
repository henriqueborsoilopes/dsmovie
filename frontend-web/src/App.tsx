import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { FormCard, Navbar } from './component';

export const App = () => {
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/form">
            <Route path=":movieId" element={<FormCard />} />
          </Route>
        </Routes>
      </BrowserRouter>
    </>
  );
};
