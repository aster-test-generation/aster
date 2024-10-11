import unittest
from ansible.modules.getent import getent_passwd, getent_group, getent_hosts, getent_services, getent_shadow


class TestGetentPasswd(unittest.TestCase):
    def test_getent_passwd(self):
        result = getent_passwd()
        self.assertIsInstance(result, dict)
        self.assertIn('root', result)
        self.assertEqual(result['root'], ['x', '0', '0', 'root', '/root', '/bin/bash'])

class TestGetentGroup(unittest.TestCase):
    def test_getent_group(self):
        result = getent_group()
        self.assertIsInstance(result, dict)
        self.assertIn('root', result)
        self.assertEqual(result['root'], ['0', 'root'])

class TestGetentHosts(unittest.TestCase):
    def test_getent_hosts(self):
        result = getent_hosts()
        self.assertIsInstance(result, dict)
        self.assertIn('localhost', result)
        self.assertEqual(result['localhost'], ['127.0.0.1', 'localhost'])

class TestGetentServices(unittest.TestCase):
    def test_getent_services(self):
        result = getent_services()
        self.assertIsInstance(result, dict)
        self.assertIn('ssh', result)
        self.assertEqual(result['ssh'], ['22/tcp', '# OpenSSH'])


if __name__ == '__main__':
    unittest.main()