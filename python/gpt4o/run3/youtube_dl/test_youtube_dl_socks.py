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
        error = ProxyError('CODES')
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

    @patch('youtube_dl.socks.sockssocket.recv')
    def test_recvall(self, mock_recv):
        mock_recv.side_effect = [b'1234', b'5678']
        result = self.sock.recvall(8)
        self.assertEqual(result, b'12345678')

    @patch('youtube_dl.socks.sockssocket.recvall')
    def test_recv_bytes(self, mock_recvall):
        mock_recvall.return_value = b'\x01\x02'
        result = self.sock._recv_bytes(2)
        self.assertEqual(result, (1, 2))

    def test_len_and_data(self):
        result = self.sock._len_and_data(b'test')
        self.assertEqual(result, b'\x04test')

    @patch('youtube_dl.socks.sockssocket.close')
    def test_check_response_version(self, mock_close):
        with self.assertRaises(InvalidVersionError):
            self.sock._check_response_version(0x04, 0x05)
        mock_close.assert_called_once()

    @patch('socket.inet_aton')
    def test_resolve_address(self, mock_inet_aton):
        mock_inet_aton.side_effect = socket.error
        result = self.sock._resolve_address('localhost', SOCKS4_DEFAULT_DSTIP, True)
        self.assertEqual(result, socket.inet_aton(socket.gethostbyname('localhost')))

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
        mock_setup_socks4.assert_called_once_with(('localhost', 80), is_4a=True)

    @patch('youtube_dl.socks.sockssocket.sendall')
    @patch('youtube_dl.socks.sockssocket._recv_bytes')
    @patch('youtube_dl.socks.sockssocket._check_response_version')
    def test_socks5_auth(self, mock_check_response_version, mock_recv_bytes, mock_sendall):
        self.sock.setproxy(ProxyType.SOCKS5, 'localhost', 1080, username='user', password='pass')
        mock_recv_bytes.side_effect = [(SOCKS5_VERSION, Socks5Auth.AUTH_USER_PASS), (SOCKS5_USER_AUTH_VERSION, SOCKS5_USER_AUTH_SUCCESS)]
        self.sock._socks5_auth()
        mock_check_response_version.assert_called()

    @patch('youtube_dl.socks.sockssocket.sendall')
    @patch('youtube_dl.socks.sockssocket._recv_bytes')
    @patch('youtube_dl.socks.sockssocket._check_response_version')
    @patch('youtube_dl.socks.sockssocket._socks5_auth')
    @patch('socket.inet_aton')
    def test_setup_socks5(self, mock_inet_aton, mock_socks5_auth, mock_check_response_version, mock_recv_bytes, mock_sendall):
        self.sock.setproxy(ProxyType.SOCKS5, 'localhost', 1080)
        mock_inet_aton.return_value = b'\x7f\x00\x00\x01'
        mock_recv_bytes.side_effect = [(SOCKS5_VERSION, Socks5Error.ERR_SUCCESS, 0, Socks5AddressType.ATYP_IPV4), b'\x7f\x00\x00\x01', (80,)]
        result = self.sock._setup_socks5(('localhost', 1080))
        self.assertEqual(result, (b'\x7f\x00\x00\x01', 80))

    @patch('youtube_dl.socks.sockssocket._setup_socks5')
    @patch('socket.socket.connect')
    def test_make_proxy(self, mock_connect, mock_setup_socks5):
        self.sock.setproxy(ProxyType.SOCKS5, 'localhost', 1080)
        self.sock._make_proxy(mock_connect, ('localhost', 80))
        mock_connect.assert_called_once_with(self.sock, ('localhost', 1080))
        mock_setup_socks5.assert_called_once_with(('localhost', 1080))

    @patch('youtube_dl.socks.sockssocket._make_proxy')
    def test_connect(self, mock_make_proxy):
        self.sock.connect(('localhost', 80))
        mock_make_proxy.assert_called_once_with(socket.socket.connect, ('localhost', 80))

    @patch('youtube_dl.socks.sockssocket._make_proxy')
    def test_connect_ex(self, mock_make_proxy):
        self.sock.connect_ex(('localhost', 80))
        mock_make_proxy.assert_called_once_with(socket.socket.connect_ex, ('localhost', 80))

if __name__ == '__main__':
    unittest.main()