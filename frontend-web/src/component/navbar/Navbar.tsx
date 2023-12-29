import './Navbar.css';
import githubIcon from '../../assets/img/github.svg';

export const Navbar = () => {
  return (
    <>
      <header>
        <nav className="container">
          <div className="dsmovie-nav-content">
            <h1>DSMovie</h1>
            <a
              href="https://github.com/henriqueborsoilopes"
              target="_blank"
              rel="noreferrer"
            >
              <div className="dsmovie-contact-container">
                <img src={githubIcon} alt="Github icon" />
                <p className="dsmovie-contact-link">/henriqueborsoilopes</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
    </>
  );
};
