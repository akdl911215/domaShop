import logo from './logo.svg';
import './App.css';
import { Signup } from 'webapp/user/index';
import { BrowserRouter as Router, Link, Route } from 'react-router-dom';
import { Home } from 'webapp/home/index';

const App = () => {
    return (
        <>
            <Router basename="/">
                <Route exact path="/" component={Home} />
                {/* <Link to="/users/users_signup" component={Signup} /> */}
            </Router>
        </>
    );
};

export default App;
