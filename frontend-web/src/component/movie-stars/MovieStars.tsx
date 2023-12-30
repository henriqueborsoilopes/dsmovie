import starFull from '../../asset/img/star-full.svg';
import starHalf from '../../asset/img/star-half.svg';
import starEmpty from '../../asset/img/star-empty.svg';
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
