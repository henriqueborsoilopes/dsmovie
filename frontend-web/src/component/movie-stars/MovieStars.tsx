import starFull from '../../assets/img/star-full.svg';
import starHalf from '../../assets/img/star-half.svg';
import starEmpty from '../../assets/img/star-empty.svg';
import './MovieStars.css';

export const MovieStars = () => {
  return (
    <>
      <div className="dsmovie-stars-container">
        <img src={starFull} alt="Full Star" />
        <img src={starFull} alt="Full Star" />
        <img src={starFull} alt="Full Star" />
        <img src={starHalf} alt="Half Star" />
        <img src={starEmpty} alt="Empty Star" />
      </div>
    </>
  );
};
