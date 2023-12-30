import { MovieStars } from '..';
import './MovieScore.css';

export const MovieScore = () => {
  const score = 3.5;
  const count = 12;
  return (
    <div className="dsmovie-score-container">
      <p className="dsmovie-score-value">
        {score > 0 ? score.toFixed(1) : '-'}
      </p>
      <MovieStars />
      <p className="dsmovie-score-count">{count} avaliações</p>
    </div>
  );
};
