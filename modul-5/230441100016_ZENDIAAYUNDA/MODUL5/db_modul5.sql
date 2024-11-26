-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Nov 2024 pada 05.45
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_modul5`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jabatan` varchar(30) NOT NULL,
  `dapartemen` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`id`, `nama`, `jabatan`, `dapartemen`) VALUES
(7, 'Zendia Ayunda', 'Manager', 'Administrasi'),
(8, 'Zendia Amelia', 'Staff', 'Designer'),
(9, 'Fibri Aulia', 'Manager', 'Akuntansi'),
(10, 'Evril Rifi Anggrelia', 'Staff', 'Designer Fashion'),
(11, 'Frieke Eka', 'Staff', 'Pendidikan'),
(12, 'Miftachul Mualifah', 'Staff', 'Modeling Fashion'),
(13, 'Nada Aprillia', 'Staff', 'Programming');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_proyek`
--

CREATE TABLE `tb_proyek` (
  `id` int(11) NOT NULL,
  `nama_proyek` varchar(50) NOT NULL,
  `durasi_pengerjaan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_proyek`
--

INSERT INTO `tb_proyek` (`id`, `nama_proyek`, `durasi_pengerjaan`) VALUES
(7, 'Surat Administrasi Perusahaan', 4),
(8, 'Design UI/UX', 2),
(9, 'Keuangan Perusahaan', 5),
(10, 'Design Fashion Batik Perusahaan', 10),
(11, 'Modul Belajar Bidang Datar Persegi', 7),
(12, 'Modeling Fashion Batik', 4),
(13, 'Web Fashion Batik', 10);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `id_karyawan` int(11) NOT NULL,
  `id_proyek` int(11) NOT NULL,
  `peran` varchar(30) NOT NULL,
  `durasi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`id_karyawan`, `id_proyek`, `peran`, `durasi`) VALUES
(7, 7, 'Administrator', '4'),
(8, 8, 'Designer', '6'),
(9, 9, 'Specialistt', '5'),
(10, 10, 'Designer', '10'),
(11, 11, 'Guru', '7');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `tb_proyek`
--
ALTER TABLE `tb_proyek`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`id_karyawan`),
  ADD UNIQUE KEY `id_karyawan` (`id_karyawan`),
  ADD KEY `id_proyek` (`id_proyek`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT untuk tabel `tb_proyek`
--
ALTER TABLE `tb_proyek`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
