function getCart() {
    const cart = localStorage.getItem('obattani_cart');
    return cart ? JSON.parse(cart) : [];
}

// Fungsi untuk menyimpan keranjang ke localStorage
function saveCart(cart) {
    localStorage.setItem('obattani_cart', JSON.stringify(cart));
    updateCartIcon(); // Update ikon keranjang
}

// Fungsi untuk menambah produk ke keranjang
function addToCart(productName, price, unit) {
    const cart = getCart();
    const existing = cart.find(item => item.name === productName);
    
    if (existing) {
        existing.quantity += 1;
    } else {
        cart.push({
            id: Date.now(),
            name: productName,
            price: parseFloat(price.replace(/[^0-9,-]+/g, "")), // Ambil angka dari "Rp 125.000"
            unit: unit,
            quantity: 1
        });
    }
    
    saveCart(cart);
    alert(`${productName} ditambahkan ke keranjang!`);
}

// Fungsi update ikon keranjang (jumlah item)
function updateCartIcon() {
    const cart = getCart();
    const totalItems = cart.reduce((sum, item) => sum + item.quantity, 0);
    const badge = document.getElementById('cartBadge');
    if (badge) {
        badge.textContent = totalItems;
        badge.classList.toggle('hidden', totalItems === 0);
    }
}