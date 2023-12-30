import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Form, Listing } from './page';
import { Navbar } from './component';

export const App = () => {
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<Listing />} />
          <Route path="/form">
            <Route path=":movieId" element={<Form />} />
          </Route>
        </Routes>
      </BrowserRouter>
    </>
  );
};
