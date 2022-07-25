import axios from 'axios'


const get = (url, callback) => {
    axios.get(`${url}`).then(response => response.data)
        .then( (response) => {
            console.log('response',response)
            callback.call(response);
        })
        .catch( (err) => {
            console.log(err)
        })

}

const post = (params) => {

    axios.post(params.url, params)
    .then( (response) => {
        console.log(response)
    })
    .catch( (err) => {
        console.error(err)
    })
}

const del = (params) => {

    axios.delete(params.url)
        .then( (response) => {
            console.log(response)
        })
        .catch( (err) => {
            console.error(err)
        })
}

export {get, post};
