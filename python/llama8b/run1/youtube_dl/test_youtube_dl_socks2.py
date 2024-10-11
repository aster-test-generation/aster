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
        error = ProxyError(0, 'unknown error')
        self.assertEqual(error.code, 0)
        self.assertEqual(error.msg, 'unknown error')

class TestInvalidVersionError(unittest.TestCase):
    def test_InvalidVersionError(self):
        error = InvalidVersionError(0x01, 0x02)
        self.assertEqual(error.expected_version, 0x01)
        self.assertEqual(error.got_version, 0x02)

class TestSocks4Error(unittest.TestCase):
    def test_Socks4Error(self):
        error = Socks4Error(91, 'request rejected or failed')
        self.assertEqual(error.code, 91)
        self.assertEqual(error.msg, 'request rejected or failed')

class TestSocks5Error(unittest.TestCase):
    def test_Socks5Error(self):
        error = Socks5Error(0x01, 'general SOCKS server failure')
        self.assertEqual(error.code, 0x01)
        self.assertEqual(error.msg, 'general SOCKS server failure')

class TestProxyType(unittest.TestCase):
    def test_ProxyType(self):
        self.assertEqual(ProxyType.SOCKS4, 0)
        self.assertEqual(ProxyType.SOCKS4A, 1)
        self.assertEqual(ProxyType.SOCKS5, 2)

class TestProxy(unittest.TestCase):
    def test_Proxy(self):
        proxy = Proxy(ProxyType.SOCKS4, 'host', 1234, 'username', 'password', True)
        self.assertEqual(proxy.type, ProxyType.SOCKS4)
        self.assertEqual(proxy.host, 'host')
        self.assertEqual(proxy.port, 1234)
        self.assertEqual(proxy.username, 'username')
        self.assertEqual(proxy.password, 'password')
        self.assertTrue(proxy.remote_dns)

class TestSockssocket(unittest.TestCase):
    def test_init(self):
        sock = sockssocket()
        self.assertIsNone(sock._proxy)

    def test_setproxy(self):
        sock = sockssocket()
        sock.setproxy(ProxyType.SOCKS4, 'host', 1234, rdns=True, username='username', password='password')
        self.assertEqual(sock._proxy.type, ProxyType.SOCKS4)
        self.assertEqual(sock._proxy.host, 'host')
        self.assertEqual(sock._proxy.port, 1234)
        self.assertEqual(sock._proxy.remote_dns, True)
        self.assertEqual(sock._proxy.username, 'username')
        self.assertEqual(sock._proxy.password, 'password')

    def test_recvall(self):
        sock = sockssocket()
        sock.recv = lambda x: b'123456'
        result = sock.recvall(6)
        self.assertEqual(result, b'123456')

    def test_recv_bytes(self):
        sock = sockssocket()
        sock.recv = lambda x: b'123456'
        result = sock._recv_bytes(6)
        self.assertEqual(result, (b'123456',))

    def test_len_and_data(self):
        sock = sockssocket()
        data = b'123456'
        result = sock._len_and_data(data)
        self.assertEqual(result, compat_struct_pack('!B', len(data)) + data)

    def test_check_response_version(self):
        sock = sockssocket()
        sock._check_response_version(0x01, 0x02)
        self.fail('Expected InvalidVersionError')

if __name__ == '__main__':
    unittest.main()