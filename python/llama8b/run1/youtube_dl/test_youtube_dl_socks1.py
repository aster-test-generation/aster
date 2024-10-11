import unittest
from youtube_dl.socks import Socks4Command, Socks5Command, Socks5Auth, Socks5AddressType, ProxyError, InvalidVersionError, Socks4Error, Socks5Error, ProxyType, sockssocket

class TestSocks4Command(unittest.TestCase):
    def test_Socks4Command(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_Socks5Command(self):
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

class TestSocks5Auth(unittest.TestCase):
    def test_Socks5Auth(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

class TestSocks5AddressType(unittest.TestCase):
    def test_Socks5AddressType(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

class TestProxyError(unittest.TestCase):
    def test_ProxyError(self):
        error = ProxyError(0, 'test error')
        self.assertEqual(error.code, 0)
        self.assertEqual(error.msg, 'test error')

class TestInvalidVersionError(unittest.TestCase):
    def test_InvalidVersionError(self):
        error = InvalidVersionError(0x01, 0x02)
        self.assertEqual(error.expected_version, 0x01)
        self.assertEqual(error.got_version, 0x02)

class TestSocks4Error(unittest.TestCase):
    def test_Socks4Error(self):
        error = Socks4Error(91, 'test error')
        self.assertEqual(error.code, 91)
        self.assertEqual(error.msg, 'test error')

class TestSocks5Error(unittest.TestCase):
    def test_Socks5Error(self):
        error = Socks5Error(0x01, 'test error')
        self.assertEqual(error.code, 0x01)
        self.assertEqual(error.msg, 'test error')

class TestProxyType(unittest.TestCase):
    def test_ProxyType(self):
        self.assertEqual(ProxyType.SOCKS4, 0)
        self.assertEqual(ProxyType.SOCKS4A, 1)
        self.assertEqual(ProxyType.SOCKS5, 2)

class Testsockssocket(unittest.TestCase):
    def test_init(self):
        sock = sockssocket()
        self.assertIsNone(sock._proxy)

    def test_setproxy(self):
        sock = sockssocket()
        sock.setproxy(ProxyType.SOCKS4, 'test', 123, rdns=True, username='test', password='test')
        self.assertEqual(sock._proxy.type, ProxyType.SOCKS4)
        self.assertEqual(sock._proxy.host, 'test')
        self.assertEqual(sock._proxy.port, 123)
        self.assertTrue(sock._proxy.rdns)
        self.assertEqual(sock._proxy.username, 'test')
        self.assertEqual(sock._proxy.password, 'test')

    def test_recvall(self):
        sock = sockssocket()
        sock.sendall(b'123456')
        self.assertEqual(sock.recvall(3), b'123')
        self.assertEqual(sock.recvall(3), b'456')

    def test_recv_bytes(self):
        sock = sockssocket()
        sock.sendall(b'123456')
        self.assertEqual(sock._recv_bytes(3), (b'123',))
        self.assertEqual(sock._recv_bytes(3), (b'456',))

    def test_len_and_data(self):
        data = b'123'
        self.assertEqual(sockssocket._len_and_data(data), compat_struct_pack('!B', len(data)) + data)

    def test_check_response_version(self):
        sock = sockssocket()
        sock._check_response_version(0x01, 0x02)
        with self.assertRaises(InvalidVersionError):
            sock._check_response_version(0x01, 0x02)

    def test_resolve_address(self):
        sock = sockssocket()
        self.assertEqual(sock._resolve_address('test', None, True), socket.inet_aton('test'))
        self.assertEqual(sock._resolve_address('test', None, False), socket.inet_aton('test'))
        with self.assertRaises(socket.error):
            sock._resolve_address('test', None, True)

if __name__ == '__main__':
    unittest.main()