import unittest
from ansible.modules.systemd import *






class TestSystemd(unittest.TestCase):
    def test_parse_systemctl_show(self):
        lines = []
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {})

    def test_parse_systemctl_show_2(self):
        lines = ['k=v']
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {'k': 'v'})

    def test_parse_systemctl_show_3(self):
        lines = ['k=v', 'k2=v2']
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {'k': 'v', 'k2': 'v2'})

    def test_parse_systemctl_show_4(self):
        lines = ['k=v', 'k2=v2', 'k3=v3']
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {'k': 'v', 'k2': 'v2', 'k3': 'v3'})

    def test_parse_systemctl_show_5(self):
        lines = ['k=v', 'k2=v2', 'k3=v3', 'k4=v4']
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {'k': 'v', 'k2': 'v2', 'k3': 'v3', 'k4': 'v4'})

    def test_parse_systemctl_show_6(self):
        lines = ['k=v', 'k2=v2', 'k3=v3', 'k4=v4', 'k5=v5']
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {'k': 'v', 'k2': 'v2', 'k3': 'v3', 'k4': 'v4', 'k5': 'v5'})

    def test_parse_systemctl_show_7(self):
        lines = ['k=v', 'k2=v2', 'k3=v3', 'k4=v4', 'k5=v5', 'k6=v6']
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {'k': 'v', 'k2': 'v2', 'k3': 'v3', 'k4': 'v4', 'k5': 'v5', 'k6': 'v6'})

    def test_parse_systemctl_show_8(self):
        lines = ['k=v', 'k2=v2', 'k3=v3', 'k4=v4', 'k5=v5', 'k6=v6', 'k7=v7']
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {'k': 'v', 'k2': 'v2', 'k3': 'v3', 'k4': 'v4', 'k5': 'v5', 'k6': 'v6', 'k7': 'v7'})

    def test_parse_systemctl_show_9(self):
        lines = ['k=v', 'k2=v2', 'k3=v3', 'k4=v4', 'k5=v5', 'k6=v6', 'k7=v7', 'k8=v8']
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {'k': 'v', 'k2': 'v2', 'k3': 'v3', 'k4': 'v4', 'k5': 'v5', 'k6': 'v6', 'k7': 'v7', 'k8': 'v8'})

if __name__ == '__main__':
    unittest.main()