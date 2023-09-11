-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 28 Des 2022 pada 12.41
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_edu`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_jurnal`
--

CREATE TABLE `data_jurnal` (
  `no_jurnal` varchar(50) NOT NULL,
  `pengarang` varchar(50) NOT NULL,
  `judul` varchar(155) NOT NULL,
  `tahun` varchar(10) NOT NULL,
  `penerbit` varchar(100) NOT NULL,
  `topik` varchar(50) NOT NULL,
  `user_id` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_jurnal`
--

INSERT INTO `data_jurnal` (`no_jurnal`, `pengarang`, `judul`, `tahun`, `penerbit`, `topik`, `user_id`) VALUES
('J001', 'Wigati, J', 'Solusi Numerik Persamaan Non-Linear Dengan Metode ', '2017', 'Jurnal Teknologi Terapan', 'Sains', 'JF001'),
('J002', 'Agustina', 'Pengaruh Daun Centella Asiatica pada Kulit', '2016', 'Jurnal Pendidikan', 'Farmasi', 'JF004'),
('J003', 'Brandon Nichol', 'Sistem Komunikasi pada Masyarakat', '2014', 'Jurnal Pendidikan', 'Pendidikan', 'JF004'),
('J004', 'Sischa, K', 'Pengaruh Media Belajar Elektronik pada Pembelajara', '2013', 'Jurnal Pendidikan', 'Pendidikan', 'JF004'),
('J005', 'Nasiha', 'Perbandingan Molekul Chetanol dengan Magnesium', '2018', 'Jurnal Sains', 'Sains', 'JF006'),
('J006', 'James ', 'Algoritma Struktur Data', '2021', 'Jurnal Ilmu Komputer', 'Ilmu Komputer', 'JF006'),
('J007', 'Bimo Laksmana', 'Pengimplementasian Random Numbers', '2010', 'Jurnal Ilmu Komputer', 'Ilmu Komputer', 'JF006'),
('J008', 'Ina Fauziah, dkk', 'Analisis Implementasi Chetanol', '2020', 'Jurnal Sains', 'Sains', 'JF005'),
('J009', 'Jessica Handayanita', 'Hubungan Antara Kecerdasan Emosional dan Prestasi', '2017', 'Jurnal Psikologi', 'Psikologi', 'JF005'),
('J010', 'Herru Budiman', 'Model Matematika pada Framework .NET', '2015', 'Jurnal UNNES', 'Sains', 'JF005'),
('J011', 'Amalia Imroatul', 'Model Kredibilitas dengan Risiko Bersama', '2015', 'Jurnal Statistika', 'Statistika', 'JF001'),
('J012', 'Azizah Salsa', 'Pemanfaatan Bakteri Milotus sebagai Pencegah Infeksi', '2018', 'Jurnal Penelitian', 'Sains', 'JF002'),
('J013', 'Bashir Hanafi', 'Metode Bayesian untuk Memprediksi Iklim di Indonesia', '2021', 'Jurnal Statistika', 'Statistika', 'JF007'),
('J014', 'Kalya Alifa', 'Pototype Lampu Lalu Lintas Berbasis NODEMCU', '2022', 'Jurnal Teknik', 'Teknik', 'JF002'),
('J015', 'Anisa Fitriwati', 'Pengaruh Media Sosial pada Kesehatan Mental', '2012', 'Jurnal Psikologi', 'Psikologi', 'JF003'),
('J016', 'Nada Asyifa', 'Klasifikasi Warga BJB menggunakan Data Mining', '2020', 'Jurnal Ilmu Komputer', 'Ilmu Komputer', 'JF009x');

-- --------------------------------------------------------

--
-- Struktur dari tabel `koleksiku`
--

CREATE TABLE `koleksiku` (
  `no_jurnal` varchar(25) NOT NULL,
  `pengarang` varchar(50) NOT NULL,
  `judul` varchar(155) NOT NULL,
  `tahun` varchar(50) NOT NULL,
  `penerbit` varchar(50) NOT NULL,
  `topik` varchar(50) NOT NULL,
  `user` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `koleksiku`
--

INSERT INTO `koleksiku` (`no_jurnal`, `pengarang`, `judul`, `tahun`, `penerbit`, `topik`, `user`) VALUES
('J002', 'Agustina', 'Pengaruh Daun Centella Asiatica pada Kulit', '2016', 'Jurnal Pendidikan', 'Farmasi', 'annisa'),
('J003', 'Brandon', 'Sistem Komunikasi pada Masyarakat', '2014', 'Jurnal Pendidikan', 'Pendidikan', 'annisa'),
('J003', 'Brandon Nichol', 'Sistem Komunikasi pada Masyarakat', '2014', 'Jurnal Pendidikan', 'Pendidikan', 'yasir'),
('J001', 'Wigati, J', 'Solusi Numerik Persamaan Non-Linear Dengan Metode ', '2017', 'Jurnal Teknologi Terapan', 'Sains', 'pita'),
('J008', 'Ina Fauziah, dkk', 'Analisis Implementasi Chetanol', '2020', 'Jurnal Sains', 'Sains', 'pita'),
('J011', 'Amalia Imroatul', 'Model Kredibilitas dengan Risiko Bersama', '2015', 'Jurnal Statistika', 'Statistika', 'nisa'),
('J007', 'Bimo Laksmana', 'Pengimplementasian Random Numbers', '2010', 'Jurnal Ilmu Komputer', 'Ilmu Komputer', 'tasya'),
('J005', 'Nasiha', 'Perbandingan Molekul Chetanol dengan Magnesium', '2018', 'Jurnal Sains', 'Sains', 'tasya'),
('J006', 'James ', 'Algoritma Struktur Data', '2021', 'Jurnal Ilmu Komputer', 'Ilmu Komputer', 'Bashir'),
('J010', 'Herru Budiman', 'Model Matematika pada Framework .NET', '2015', 'Jurnal UNNES', 'Sains', 'Bashir'),
('J010', 'Herru Budiman', 'Model Matematika pada Framework .NET', '2015', 'Jurnal UNNES', 'Sains', 'lia'),
('J010', 'Herru Budiman', 'Model Matematika pada Framework .NET', '2015', 'Jurnal UNNES', 'Sains', 'Nada');

-- --------------------------------------------------------

--
-- Struktur dari tabel `register`
--

CREATE TABLE `register` (
  `id` varchar(20) NOT NULL,
  `user` varchar(20) NOT NULL,
  `pw` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `register`
--

INSERT INTO `register` (`id`, `user`, `pw`) VALUES
('JF001', 'lia', 'cantik'),
('JF002', 'kalya', 'kucing'),
('JF003', 'nisa', 'ilkom'),
('JF004', 'yasir', 'fmipa'),
('JF005', 'pita', 'lavio'),
('JF006', 'annisa', 'salsa'),
('JF007', 'Bashir', 'wibu'),
('JF008', 'tasya', 'fmipa'),
('JF009', 'Nada', 'ilkom'),
('JF010', 'Nada', 'ilkom');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_jurnal`
--
ALTER TABLE `data_jurnal`
  ADD PRIMARY KEY (`no_jurnal`);

--
-- Indeks untuk tabel `koleksiku`
--
ALTER TABLE `koleksiku`
  ADD KEY `no_jurnal` (`no_jurnal`);

--
-- Indeks untuk tabel `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
