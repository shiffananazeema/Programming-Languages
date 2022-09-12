import React, {useState, useEffect} from 'react'

const Course = () => {

    let [course, setCourse] = useState([])

    useEffect(()=> {
        courseViewSet()
    }, [])

    let courseViewSet = async () => {
        let response = await fetch('http://127.0.0.1:8000/college/')
        let data = await response.json()
        console.log('DATA:', data)
        setCourse()
    }

  return (
    <div>
        course
    </div>
  )
}

export default Course