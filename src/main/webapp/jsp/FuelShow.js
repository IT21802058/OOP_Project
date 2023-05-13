const data = { 
    labels: ['Petrol', 'Octane95 Petrol ', 'Diesel', 'Super Diesel'],
    datasets: [{
		
		int:petrol=7500,
		int:octane95=10000,
		int:diesel=6000,
		int:superdiesel=3000,
        label: '#Storage Amount',
        data: [petrol, octane95, diesel, superdiesel],
        backgroundColor: [
            'rgba(255, 99, 132, 0.2)',
            'rgba(54, 162, 235, 0.2)',
            'rgba(255, 206, 86, 0.2)',
            'rgba(75, 192, 192, 0.2)',
            'rgba(153, 102, 255, 0.2)'
        ],
        borderColor: [
            'rgba(255, 99, 132, 1)',
            'rgba(54, 162, 235, 1)',
            'rgba(255, 206, 86, 1)',
            'rgba(75, 192, 192, 1)',
            'rgba(153, 102, 255, 1)'
        ],
        borderWidth: 1
    }]
};

const options = {
    scales: {
        y: {
            beginAtZero: true
        }
    }
};

const ctx = document.getElementById('myChart').getContext('2d');
const myChart = new Chart(ctx, {
    type: 'bar',
    data: data,
    options: options
});