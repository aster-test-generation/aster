import unittest
from unittest.mock import patch, MagicMock
from youtube_dl.socks import *


class TestSocks4Command(unittest.TestCase):
    def test_cmd_connect(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)

    def test_cmd_bind(self):
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_cmd_udp_associate(self):
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

class TestSocks5Auth(unittest.TestCase):
    def test_auth_none(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)

    def test_auth_gssapi(self):
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)

    def test_auth_user_pass(self):
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)

    def test_auth_no_acceptable(self):
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

class TestSocks5AddressType(unittest.TestCase):
    def test_atyp_ipv4(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)

    def test_atyp_domainname(self):
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)

    def test_atyp_ipv6(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

class TestProxyError(unittest.TestCase):
    def test_init_with_code(self):
        error = ProxyError(0x01)
        self.assertEqual(error.args[0], 0x01)

    def test_init_with_code_and_msg(self):
        error = ProxyError(0x01, "Test message")
        self.assertEqual(error.args[1], "Test message")

class TestInvalidVersionError(unittest.TestCase):
    def test_init(self):
        error = InvalidVersionError(0x04, 0x05)
        self.assertEqual(error.args[1], "Invalid response version from server. Expected 04 got 05")

class TestSocks4Error(unittest.TestCase):
    def test_err_success(self):
        self.assertEqual(Socks4Error.ERR_SUCCESS, 90)

    def test_codes(self):
        self.assertEqual(Socks4Error.CODES[91], 'request rejected or failed')

class TestSocks5Error(unittest.TestCase):
    def test_err_general_failure(self):
        self.assertEqual(Socks5Error.ERR_GENERAL_FAILURE, 0x01)

    def test_codes(self):
        self.assertEqual(Socks5Error.CODES[0x01], 'general SOCKS server failure')

class TestProxyType(unittest.TestCase):
    def test_socks4(self):
        self.assertEqual(ProxyType.SOCKS4, 0)

    def test_socks4a(self):
        self.assertEqual(ProxyType.SOCKS4A, 1)

    def test_socks5(self):
        self.assertEqual(ProxyType.SOCKS5, 2)

class TestSockssocket(unittest.TestCase):
    def setUp(self):
        self.sock = sockssocket()

    def test_init(self):
        self.assertIsNone(self.sock._proxy)

    def test_setproxy(self):
        self.sock.setproxy(ProxyType.SOCKS5, 'localhost', 1080)
        self.assertEqual(self.sock._proxy.type, ProxyType.SOCKS5)

    @patch('youtube_dl.socks.socket.socket.recv')
    def test_recvall(self, mock_recv):
        mock_recv.side_effect = [b'1234', b'5678']
        result = self.sock.recvall(8)
        self.assertEqual(result, b'12345678')

    @patch('youtube_dl.socks.socket.socket.recv')
    def test_recv_bytes(self, mock_recv):
        mock_recv.side_effect = [b'\x01', b'\x02']
        result = self.sock._recv_bytes(2)
        self.assertEqual(result, (1, 2))

    def test_len_and_data(self):
        result = self.sock._len_and_data(b'test')
        self.assertEqual(result, b'\x04test')

    def test_check_response_version(self):
        with self.assertRaises(InvalidVersionError):
            self.sock._check_response_version(0x04, 0x05)

    @patch('youtube_dl.socks.socket.inet_aton')
    def test_resolve_address(self, mock_inet_aton):
        mock_inet_aton.side_effect = socket.error
        result = self.sock._resolve_address('localhost', SOCKS4_DEFAULT_DSTIP, False)
        self.assertEqual(result, SOCKS4_DEFAULT_DSTIP)

    @patch('youtube_dl.socks.socket.socket.sendall')
    @patch('youtube_dl.socks.sockssocket.recvall')
    def test_setup_socks4(self, mock_recvall, mock_sendall):
        mock_recvall.return_value = compat_struct_pack('!BBHI', SOCKS4_REPLY_VERSION, Socks4Error.ERR_SUCCESS, 0, 0)
        result = self.sock._setup_socks4(('localhost', 80))
        self.assertEqual(result, (0, 0))

    @patch('youtube_dl.socks.sockssocket._setup_socks4')
    def test_setup_socks4a(self, mock_setup_socks4):
        self.sock._setup_socks4a(('localhost', 80))
        mock_setup_socks4.assert_called_with(('localhost', 80), is_4a=True)

    @patch('youtube_dl.socks.sockssocket._recv_bytes')
    @patch('youtube_dl.socks.sockssocket.sendall')
    def test_socks5_auth(self, mock_sendall, mock_recv_bytes):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        mock_recv_bytes.side_effect = [(SOCKS5_VERSION, Socks5Auth.AUTH_USER_PASS), (SOCKS5_USER_AUTH_VERSION, SOCKS5_USER_AUTH_SUCCESS)]
        self.sock._socks5_auth()
        self.assertTrue(mock_sendall.called)

    @patch('youtube_dl.socks.sockssocket._recv_bytes')
    @patch('youtube_dl.socks.sockssocket.sendall')
    @patch('youtube_dl.socks.sockssocket._socks5_auth')
    @patch('youtube_dl.socks.sockssocket._resolve_address')
    def test_setup_socks5(self, mock_resolve_address, mock_socks5_auth, mock_sendall, mock_recv_bytes):
        mock_resolve_address.return_value = None
        mock_recv_bytes.side_effect = [(SOCKS5_VERSION, Socks5Error.ERR_SUCCESS, 0, Socks5AddressType.ATYP_IPV4), b'\x00\x00\x00\x00', b'\x00\x50']
        result = self.sock._setup_socks5(('localhost', 80))
        self.assertEqual(result, (b'\x00\x00\x00\x00', 80))

    @patch('youtube_dl.socks.sockssocket._setup_socks4')
    @patch('youtube_dl.socks.sockssocket._setup_socks4a')
    @patch('youtube_dl.socks.sockssocket._setup_socks5')
    @patch('youtube_dl.socks.socket.socket.connect')
    def test_make_proxy(self, mock_connect, mock_setup_socks5, mock_setup_socks4a, mock_setup_socks4):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock._make_proxy(mock_connect, ('localhost', 80))
        mock_setup_socks5.assert_called_with(('localhost', 80))

    @patch('youtube_dl.socks.sockssocket._make_proxy')
    def test_connect(self, mock_make_proxy):
        self.sock.connect(('localhost', 80))
        mock_make_proxy.assert_called_with(socket.socket.connect, ('localhost', 80))

    @patch('youtube_dl.socks.sockssocket._make_proxy')
    def test_connect_ex(self, mock_make_proxy):
        self.sock.connect_ex(('localhost', 80))
        mock_make_proxy.assert_called_with(socket.socket.connect_ex, ('localhost', 80))

class TestInvalidVersionError(unittest.TestCase):
    def test_init(self):
        error = InvalidVersionError(0x04, 0x05)
        self.assertIn("Invalid response version from server", error.args[1])

class TestSocks4Error(unittest.TestCase):
    def test_init(self):
        error = Socks4Error(91)
        self.assertEqual(error.args[1], 'request rejected or failed')

class TestSocks5Error(unittest.TestCase):
    def test_init(self):
        error = Socks5Error(0x01)
        self.assertEqual(error.args[1], 'general SOCKS server failure')

class TestSockssocket(unittest.TestCase):
    def setUp(self):
        self.sock = sockssocket()

    def test_init(self):
        self.assertIsNone(self.sock._proxy)

    def test_setproxy(self):
        self.sock.setproxy(ProxyType.SOCKS5, 'localhost', 1080)
        self.assertEqual(self.sock._proxy.type, ProxyType.SOCKS5)

    def test_recvall(self):
        self.sock.recv = lambda x: b'\x00' * x
        result = self.sock.recvall(4)
        self.assertEqual(result, b'\x00\x00\x00\x00')

    def test_recvall_eof(self):
        self.sock.recv = lambda x: b''
        with self.assertRaises(EOFError):
            self.sock.recvall(4)

    def test_recv_bytes(self):
        self.sock.recvall = lambda x: b'\x01\x02'
        result = self.sock._recv_bytes(2)
        self.assertEqual(result, (1, 2))

    def test_len_and_data(self):
        result = self.sock._len_and_data(b'\x01\x02')
        self.assertEqual(result, b'\x02\x01\x02')

    def test_check_response_version(self):
        with self.assertRaises(InvalidVersionError):
            self.sock._check_response_version(0x04, 0x05)

    def test_resolve_address(self):
        result = self.sock._resolve_address('127.0.0.1', None, False)
        self.assertEqual(result, socket.inet_aton('127.0.0.1'))

    def test_resolve_address_remote_dns(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, None, None, True)
        result = self.sock._resolve_address('nonexistent.domain', SOCKS4_DEFAULT_DSTIP, True)
        self.assertEqual(result, SOCKS4_DEFAULT_DSTIP)

    def test_setup_socks4(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS4, 'localhost', 1080, None, None, False)
        self.sock.sendall = lambda x: None
        self.sock.recvall = lambda x: compat_struct_pack('!BBHI', SOCKS4_REPLY_VERSION, Socks4Error.ERR_SUCCESS, 0, 0)
        result = self.sock._setup_socks4(('127.0.0.1', 80))
        self.assertEqual(result, (0, 0))

    def test_setup_socks4_error(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS4, 'localhost', 1080, None, None, False)
        self.sock.sendall = lambda x: None
        self.sock.recvall = lambda x: compat_struct_pack('!BBHI', SOCKS4_REPLY_VERSION, 91, 0, 0)
        with self.assertRaises(Socks4Error):
            self.sock._setup_socks4(('127.0.0.1', 80))

    def test_setup_socks4a(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS4A, 'localhost', 1080, None, None, True)
        self.sock.sendall = lambda x: None
        self.sock.recvall = lambda x: compat_struct_pack('!BBHI', SOCKS4_REPLY_VERSION, Socks4Error.ERR_SUCCESS, 0, 0)
        self.sock._setup_socks4a(('127.0.0.1', 80))

    def test_socks5_auth(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock.sendall = lambda x: None
        self.sock._recv_bytes = lambda x: (SOCKS5_VERSION, Socks5Auth.AUTH_USER_PASS)
        self.sock._check_response_version = lambda x, y: None
        self.sock._socks5_auth()

    def test_socks5_auth_no_acceptable(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, None, None, True)
        self.sock.sendall = lambda x: None
        self.sock._recv_bytes = lambda x: (SOCKS5_VERSION, Socks5Auth.AUTH_NO_ACCEPTABLE)
        with self.assertRaises(Socks5Error):
            self.sock._socks5_auth()

    def test_setup_socks5(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock.sendall = lambda x: None
        self.sock._recv_bytes = lambda x: (SOCKS5_VERSION, Socks5Error.ERR_SUCCESS, 0, Socks5AddressType.ATYP_IPV4)
        self.sock.recvall = lambda x: b'\x00' * x
        result = self.sock._setup_socks5(('127.0.0.1', 80))
        self.assertEqual(result, (b'\x00\x00\x00\x00', 0))

    def test_make_proxy(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock._setup_socks5 = lambda x: None
        result = self.sock._make_proxy(lambda s, a: 0, ('127.0.0.1', 80))
        self.assertEqual(result, 0)

    def test_connect(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock._make_proxy = lambda f, a: None
        self.sock.connect(('127.0.0.1', 80))

    def test_connect_ex(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock._make_proxy = lambda f, a: 0
        result = self.sock.connect_ex(('127.0.0.1', 80))
        self.assertEqual(result, 0)

class TestSockssocket(unittest.TestCase):
    def setUp(self):
        self.sock = sockssocket()

    def test_init(self):
        self.assertIsNone(self.sock._proxy)

    def test_setproxy(self):
        self.sock.setproxy(ProxyType.SOCKS5, 'localhost', 1080)
        self.assertEqual(self.sock._proxy.type, ProxyType.SOCKS5)

    @patch('youtube_dl.socks.sockssocket.recv')
    def test_recvall(self, mock_recv):
        mock_recv.side_effect = [b'123', b'456']
        result = self.sock.recvall(6)
        self.assertEqual(result, b'123456')

    @patch('youtube_dl.socks.sockssocket.recvall')
    def test_recv_bytes(self, mock_recvall):
        mock_recvall.return_value = b'\x01\x02'
        result = self.sock._recv_bytes(2)
        self.assertEqual(result, (1, 2))

    def test_len_and_data(self):
        result = self.sock._len_and_data(b'abc')
        self.assertEqual(result, b'\x03abc')

    def test_check_response_version(self):
        with self.assertRaises(InvalidVersionError):
            self.sock._check_response_version(0x04, 0x05)

    @patch('socket.inet_aton')
    @patch('socket.gethostbyname')
    def test_resolve_address(self, mock_gethostbyname, mock_inet_aton):
        mock_inet_aton.side_effect = socket.error
        mock_gethostbyname.return_value = '127.0.0.1'
        result = self.sock._resolve_address('localhost', SOCKS4_DEFAULT_DSTIP, False)
        self.assertEqual(result, socket.inet_aton('127.0.0.1'))

    @patch('youtube_dl.socks.sockssocket.sendall')
    @patch('youtube_dl.socks.sockssocket.recvall')
    @patch('youtube_dl.socks.sockssocket._check_response_version')
    def test_setup_socks4(self, mock_check_response_version, mock_recvall, mock_sendall):
        self.sock.setproxy(ProxyType.SOCKS4, 'localhost', 1080)
        mock_recvall.return_value = compat_struct_pack('!BBHI', SOCKS4_REPLY_VERSION, Socks4Error.ERR_SUCCESS, 0, 0)
        result = self.sock._setup_socks4(('localhost', 80))
        self.assertEqual(result, (0, 0))

    @patch('youtube_dl.socks.sockssocket._setup_socks4')
    def test_setup_socks4a(self, mock_setup_socks4):
        self.sock._setup_socks4a(('localhost', 80))
        mock_setup_socks4.assert_called_with(('localhost', 80), is_4a=True)

    @patch('youtube_dl.socks.sockssocket.sendall')
    @patch('youtube_dl.socks.sockssocket._recv_bytes')
    @patch('youtube_dl.socks.sockssocket._check_response_version')
    def test_socks5_auth(self, mock_check_response_version, mock_recv_bytes, mock_sendall):
        self.sock.setproxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass')
        mock_recv_bytes.side_effect = [(SOCKS5_VERSION, Socks5Auth.AUTH_USER_PASS), (SOCKS5_USER_AUTH_VERSION, SOCKS5_USER_AUTH_SUCCESS)]
        self.sock._socks5_auth()
        mock_check_response_version.assert_called_with(SOCKS5_USER_AUTH_VERSION, SOCKS5_USER_AUTH_VERSION)

    @patch('youtube_dl.socks.sockssocket.sendall')
    @patch('youtube_dl.socks.sockssocket._recv_bytes')
    @patch('youtube_dl.socks.sockssocket._check_response_version')
    @patch('youtube_dl.socks.sockssocket._socks5_auth')
    @patch('youtube_dl.socks.sockssocket._resolve_address')
    def test_setup_socks5(self, mock_resolve_address, mock_socks5_auth, mock_check_response_version, mock_recv_bytes, mock_sendall):
        self.sock.setproxy(ProxyType.SOCKS5, 'localhost', 1080)
        mock_resolve_address.return_value = socket.inet_aton('127.0.0.1')
        mock_recv_bytes.side_effect = [(SOCKS5_VERSION, Socks5Error.ERR_SUCCESS, 0, Socks5AddressType.ATYP_IPV4), b'\x7f\x00\x00\x01', b'\x00\x50']
        result = self.sock._setup_socks5(('localhost', 80))
        self.assertEqual(result, (b'\x7f\x00\x00\x01', 80))

    @patch('youtube_dl.socks.sockssocket._setup_socks4')
    @patch('youtube_dl.socks.sockssocket._setup_socks4a')
    @patch('youtube_dl.socks.sockssocket._setup_socks5')
    @patch('socket.socket.connect')
    def test_make_proxy(self, mock_connect, mock_setup_socks5, mock_setup_socks4a, mock_setup_socks4):
        self.sock.setproxy(ProxyType.SOCKS5, 'localhost', 1080)
        self.sock._make_proxy(mock_connect, ('localhost', 80))
        mock_setup_socks5.assert_called_with(('localhost', 80))

    @patch('youtube_dl.socks.sockssocket._make_proxy')
    @patch('socket.socket.connect')
    def test_connect(self, mock_connect, mock_make_proxy):
        self.sock.connect(('localhost', 80))
        mock_make_proxy.assert_called_with(mock_connect, ('localhost', 80))

    @patch('youtube_dl.socks.sockssocket._make_proxy')
    @patch('socket.socket.connect_ex')
    def test_connect_ex(self, mock_connect_ex, mock_make_proxy):
        self.sock.connect_ex(('localhost', 80))
        mock_make_proxy.assert_called_with(mock_connect_ex, ('localhost', 80))

if __name__ == '__main__':
    unittest.main()